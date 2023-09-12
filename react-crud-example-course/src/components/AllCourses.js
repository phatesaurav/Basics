import React, { useEffect, useState } from "react";
import Course from "./Course";
import { Button } from "reactstrap";

function AllCourses() {
  const listStyle = {
    backgroundColor: "#eee",
    textAlign: "center",
    padding: "10px",
  };

  // 'hooks' are required to use 'class' based component inside 'functional' component
  // e.g. useState, useEffect

  // Whenever 'AllCourses' component is loaded on the webpage this function gets called
  // This is called when 'componentDidMount' and 'componentDidUpdate'
  // We want this function to be called only when component is mounted
  // For that we will give blank array after the function
  // We will show this example using 'Button'
  // Now for the first time when we click on 'AllCourses' alert will be show
  // But after when the pages is updated by clicking the button, alert will not be shown
  // As we gave blank array in 'useEffect' function
  useEffect(function () {
    document.title = "All Courses";
    alert("This is the test for understanding 'useEffect' Hook.");
  }, []);

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

  return (
    <div style={listStyle}>
      <Button
        onClick={function () {
          setCourses([
            ...courseArray,
            { title: "Demo Course", describe: "This is Demo Course" },
          ]);
        }}
      >
        Testing 'UseEffect' Hook
      </Button>

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
            return <Course courseProp={item} />;
          })
        : "No Course Available"}
    </div>
  );
}

export default AllCourses;
