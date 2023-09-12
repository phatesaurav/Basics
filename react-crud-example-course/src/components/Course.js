import axios from "axios";
import React from "react";
import {
  Card,
  CardBody,
  CardSubtitle,
  CardText,
  Button,
  Container,
} from "reactstrap";
import base_url from "../api/BaseURL";
import { toast } from "react-toastify";

// We will pass 'course' object in 'Course' function as argument
function Course({ courseProp, update }) {
  const courseStyle = {
    background: "papayawhip",
    paddingTop: "5px",
    paddingLeft: "5px",
    paddingRight: "5px",
    paddingBottom: "5px",
    textAlign: "center",
  };

  const cardStyle = {
    background: "thistle",
    padding: "5px",
    textAlign: "center",
  };

  const subtitleStyle = {
    fontWeight: "bold",
    fontSize: "25px",
    fontFamily: "Arial",
  };

  const buttonStyle = {
    marginRight: "10px", // Add margin to create a gap between buttons
  };

  function deleteCourse(id) {
    axios.delete(`${base_url}/courses/${id}`).then(
      function (response) {
        console.log(response);
        toast.success("course deleted");
        update(id);
      },
      function (error) {
        console.log(error);
        toast.error("error occured while deleting the course");
      }
    );
  }
  return (
    <div style={courseStyle}>
      <Card style={cardStyle}>
        <CardBody>
          <CardSubtitle style={subtitleStyle}>{courseProp.title}</CardSubtitle>
          <CardText>{courseProp.description}</CardText>
          <Container>
            <Button
              color="danger"
              style={buttonStyle}
              onClick={function () {
                deleteCourse(courseProp.id);
              }}
            >
              Delete
            </Button>
            <Button color="warning" style={buttonStyle}>
              Update
            </Button>
          </Container>
        </CardBody>
      </Card>
    </div>
  );
}

export default Course;
