import React from "react";
import { ListGroup, ListGroupItem } from "reactstrap";
import Home from "./Home";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import AddCourses from "./AddCourses";
import AboutUs from "./AboutUs";
import ContactUs from "./ContactUs";
import AllCourses from "./AllCourses";
import ViewCourses from "./ViewCourses";
import UpdateCourses from "./UpdateCourses";

function RightSide() {
  return (
    <div>
      <Router>
        <ListGroup>
          <ListGroupItem>
            <Routes>
              {/* 'path' prop in the <Route> component specifies the URL path pattern that should match for the route to be considered a match and render a particular component. 'element; prop is used to specify the component to render when the route is matched */}
              <Route path="/" element={<Home />} />
              <Route path="/add-courses" element={<AddCourses />} />
              <Route path="/update-courses" element={<UpdateCourses />} />
              <Route path="/all-courses" element={<AllCourses />} />
              <Route path="/view-courses" element={<ViewCourses />} />
              <Route path="/about-us" element={<AboutUs />} />
              <Route path="/contact-us" element={<ContactUs />} />
            </Routes>
          </ListGroupItem>
        </ListGroup>
      </Router>
    </div>
  );
}

export default RightSide;
