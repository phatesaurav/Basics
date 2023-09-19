import React, { useState, useEffect } from "react";
import Course from "./Course";
import base_url from "../api/BaseURL";
import axios from "axios";
import { ToastContainer, toast } from "react-toastify";

function ViewCourses() {
  const listStyle = {
    backgroundColor: "#eee",
    textAlign: "center",
    padding: "10px",
  };

  // We will create a function to load data from server using axios
  // We will use same trick to call that function when component is mounted on webpage
  // This will call our service inside 'useEffect'
  // If [] in the end not given then program runs in infinite loop
  useEffect(function () {
    document.title = "View Courses";
    viewAllCoursesFromServer();
  }, []);

  // Function to call server
  // We will write promise after the URL to call '.then' if URL is succeeded
  // We will pass two function in '.then'
  // One for 'success' and one for 'error'
  function viewAllCoursesFromServer() {
    axios.get(`${base_url}/courses`).then(
      function (response) {
        console.log(response.data);
        toast.success("courses are loaded from server");
        setCourses(response.data); // Calling 'setCourses' function to display data from database onto webpage
      },
      function (error) {
        console.log(error);
        toast.error("error occurred");
      }
    );
  }

  // We will make an array which has two arguments
  // First 'courses' means multiple courses
  // Second 'setCourses' function which can set 'Courses'
  // 'useState' is a hook, It enable the state
  // Because state by default we use in class component
  // But using 'useState' we can create variable for 'CourseList'
  // We will give array to 'useState([])'
  // Given array will be set to 'courses' variable
  // 'setCourses' function will be used to update 'courses' array
  // When we pass new value to the array, we must call 'setCourses' function to update 'courses' array
  const [courseArray, setCourses] = useState([
    { title: "Java Course", describe: "This is Java Course" },
    { title: "React.js Course", describe: "This is React.js Course" },
    { title: "MySql Course", describe: "This is MySql Course" },
  ]);

  function updateDeletedCourseData(id) {
    setCourses(function (courseArray) {
      return courseArray.filter(function (c) {
        return c.id !== id;
      });
    });
  }

  return (
    <div style={listStyle}>
      <h1 className="display-5">List of Courses are as follows:</h1>

      {/* Below we will print all courses in 'courseArray' */}
      {/* If there are courses available in the 'courseArray' then only we will print them */}
      {/* To print courses in 'courseArray' we will use 'map' function */}
      {courseArray.length > 0
        ? courseArray.map(function (item) {
            // '.map()' method iterates over each item in 'courseArray',
            // And for each item, it executes the provided callback function
            // 'function (item)' is anonymous callback function
            // Callback function is a function that is passed as an argument to another function
            // Anonymous callback function takes one argument, which represents an 'item' in 'courseArray'
            // Return statement renders 'Course' component for each 'item' in an array,
            // Passing the 'item' as 'course' prop
            // .map() method is executed first, and then the callback function is called for each element in an array
            return (
              <Course courseProp={item} update={updateDeletedCourseData} />
            );
          })
        : "No Course Available"}
      <ToastContainer />
    </div>
  );
}

export default ViewCourses;
