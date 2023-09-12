import axios from "axios";
import React, { useEffect, useState } from "react";
import { Button, Container, Form, FormGroup, Input, Label } from "reactstrap";
import base_url from "../api/BaseURL";
import { ToastContainer, toast } from "react-toastify";

function UpdateCourses() {
  /* const addStyle = {
    height: "500px",
  }; */

  const buttonStyle = {
    marginRight: "10px", // Add margin to create a gap between buttons
  };

  useEffect(function () {
    document.title = "Update Courses";
  }, []);

  // Now we will create 'data' i.e. 'state'
  const [courseData, setCourseData] = useState({});
  const [id, setId] = useState(""); // State to capture the ID from the form input

  function handleUpdate(e) {
    e.preventDefault();
    // Append the ID to the URL in the axios.put call
    axios.put(`${base_url}/courses/${id}`, courseData).then(
      function (response) {
        console.log(response);
        toast.success("Course updated successfully");
      },
      function (error) {
        console.log(error);
        toast.error("Error occurred while updating the course");
      }
    );
  }

  function handleReset() {
    // Reset the ID field to an empty string
    setId("");
    // Clear the other form fields as well
    setCourseData({});
  }

  return (
    <div /* style={addStyle} */>
      <h1 className="display-4 text-center my-3">Fill Course Details To Update</h1>
      {/* 'onSubmit' is our event handler, when we click on 'submit' form 'handleForm' function gets called */}
      <Form onSubmit={handleUpdate} className="mx-3 my-3">
        <FormGroup>
          <Label for="id">Course Id</Label>
          <Input
            id="id"
            name="courseId"
            placeholder="Enter Course Id Here"
            type="text"
            value={id} // Capture the ID from the form input
            onChange={(e) => setId(e.target.value)} // Update the ID when input changes
          />
        </FormGroup>

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
              setCourseData({
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
              setCourseData({
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
            Update
          </Button>
          <Button type="reset" color="warning" style={buttonStyle} onClick={handleReset}>
            Clear
          </Button>
        </Container>
      </Form>
      <ToastContainer />
    </div>
  );
}

export default UpdateCourses;
