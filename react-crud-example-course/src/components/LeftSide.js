import React from "react";
import { ListGroup, ListGroupItem } from "reactstrap";

function LeftSide() {
  return (
    <div>
      <ListGroup>
        {/* 'action' will highlight background in grey when cursor is hovered over it*/}
        {/* Use 'Link' instead of 'ListGroupItem' and 'to' instead of 'href' to avoid page refresh */}
        <ListGroupItem action href="/" tag="a">Home</ListGroupItem>
        <ListGroupItem action href="/add-courses" tag="a">Add Courses</ListGroupItem>
        <ListGroupItem action href="/update-courses" tag="a">Update Courses</ListGroupItem>
        <ListGroupItem action href="/all-courses" tag="a">All Courses</ListGroupItem>
        <ListGroupItem action href="/view-courses" tag="a">View Courses</ListGroupItem>
        <ListGroupItem action href="/about-us" tag="a">About Us</ListGroupItem>
        <ListGroupItem action href="/contact-us" tag="a">Contact Us</ListGroupItem>
      </ListGroup>
    </div>
  );
}

export default LeftSide;
