import axios from "axios";
import React, { useEffect, useState } from "react";
import { Button, Container, Form, FormGroup, Input, Label } from "reactstrap";
import base_url from "../api/BaseURL";
import { ToastContainer, toast } from "react-toastify";

function AddCourses() {
  /* const addStyle = {
    height: "500px",
  }; */

  const buttonStyle = {
    marginRight: "10px", // Add margin to create a gap between buttons
  };

  useEffect(function () {
    document.title = "Add Courses";
  }, []);

  // Now we will create 'data' i.e. 'state'
  const [courseData, setCourses] = useState({});

  // Form handler function to handle 'onSubmit' event
  // 'e' is an event object that represents an event that occurs in the browser
  // 'e.preventDefault()' is called to prevent the default behavior of form submission
  // By default, when you submit a form, the browser will send a request to the server and potentially reload the page, causing a full page refresh.
  // Now we will call function from 'handleForm' which will post data on server
  function handleForm(e) {
    console.log(courseData);
    postDataToServer(courseData); /* Here 'courseData' is passed in 'dataObj' */
    // e.preventDefault();
    setCourses({}); /* To clear the form field as soon as 'Add Course' button is clicked */
  }

  // Creating function to post data on server
  // 'dataObj' is used to send the data
  // We will write promise after the URL to call '.then' if URL is succeeded
  // We will pass two function in '.then'
  // One for 'success' and one for 'error'
  function postDataToServer(dataObj) {
    axios.post(`${base_url}/courses`, dataObj).then(
      function (response) {
        console.log(response);
        toast.success("new course added successfully");
      },
      function (error) {
        console.log(error);
        toast.success("error occurred while adding the course");
      }
    );
  }

  return (
    <div /* style={addStyle} */>
      <h1 className="display-4 text-center my-3">Fill Course Details</h1>
      {/* 'onSubmit' is our event handler, when we click on 'submit' form 'handleForm' function gets called */}
      <Form onSubmit={handleForm} className="mx-3 my-3">
        {/* <FormGroup>
          <Label for="id">Course Id</Label>
          <Input
            id="id"
            name="courseId"
            placeholder="Enter Course Id Here"
            type="text"
          />
        </FormGroup> */}

        <FormGroup>
          <Label for="title">Course Title</Label>
          <Input
            id="title"
            name="courseName"
            placeholder="Enter Course Title Here"
            type="text"
            /* Now we are creating 'onChange' function to change 'courseData' when we make any change in form data  */
            /* As soon as 'onChange' is called we will call anonymous function inside it */
            /* This function changes the 'title' data in 'courseData' when there is any change of 'title' in form data */
            /* For that we will call 'setCourses' to make changes in 'courseData' */
            /* First we will take old data by '...courseData' */
            /* Then we will change that data by 'title: e.target.value' */
            onChange={function (e) {
              setCourses({
                ...courseData,
                title: e.target.value,
              });
            }}
          />
        </FormGroup>

        <FormGroup>
          <Label for="description">Course Description</Label>
          <Input
            id="description"
            name="courseDescription"
            placeholder="Enter Course Description Here"
            type="textarea"
            style={{ height: 150 }}
            onChange={function (e) {
              setCourses({
                ...courseData,
                description: e.target.value,
              });
            }}
          />
        </FormGroup>

        {/* We used 'Container' so that button will be displayed on center */}
        {/* To place button in the center */}
        <Container className="text-center">
          {/* type="submit" because this will submit the form */}
          {/* After this we have to create handler on form */}
          <Button type="submit" color="success" style={buttonStyle}>
            Add Course
          </Button>
          <Button type="reset" color="warning" style={buttonStyle}>
            Clear
          </Button>
        </Container>
      </Form>
      <ToastContainer />
    </div>
  );
}

export default AddCourses;
