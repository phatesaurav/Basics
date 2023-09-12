import React from "react";
import "./App.css";
import TestBody from "./components/TestBody";
import Footer from "./components/Footer";
import Header from "./components/Header";
import MyButton from "./components/MyButton";
import Home from "./components/Home";
import Course from "./components/Course";
import AddCourses from "./components/AddCourses";
import { Col, Container, Row } from "reactstrap";
import LeftSide from "./components/LeftSide";
import RightSide from "./components/RightSide";
import Body from "./components/Body";

// 'App' is a functional componenet
// This function is returning HTML code
// React.js does not allow writing parallel components
// So make one parent 'div' and then write all child components like <h1>, <h2>, <p> inside it
function App() {
  const appStyle = {
    background: "lightblue",
    // position: "relative",
    left: 0,
    right: 0,
    padding: "10px",
    textAlign: "center",
    height: "400px",
  };

  return (
    <div /* style={{background:"lightgreen"}} */ /* className="App" */>
      {/* while writing style we need javascript object thus we wrote two curly braces {{ }} */}
      {/* <Header /> */}

      {/* <MyButton /> */}

      {/* <Home /> */}

      {/* Pass 'course' with object inside curly braces {{ }} */}
      {/* <Course course={{ title: "Java", description: "This is Java Course" }} /> */}
      {/* <Course course={{ title: "OS", description: "This is OS Course" }} /> */}

      {/* <ViewCourses /> */}

      {/* <AddCourses /> */}

      {/* <div style={appStyle}>
        <h1>App</h1>
        <p>This is App component</p>
      </div> */}

      {/* <TestBody /> */}

      {/* Passing dynamic value means 'Props' */}
      {/* <TestBody
        title="title 1"
        name="Body 1 is 'Props' passed from 'App.js' component to 'Body.js' component for communication"
      /> */}

      {/* <TestBody
        title="title 2"
        name="Body 2 is 'Props' passed from 'App.js' component to 'Body.js' component for communication"
      /> */}

      {/* <Footer /> */}

      {/* Wrap everything inside 'Router' */}
      <Container>
        <Row>
          <Header />
          <Body />
          <Footer />
        </Row>
      </Container>
    </div>
  );
}

export default App;
