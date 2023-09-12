import React from "react";
import { Col, Row } from "reactstrap";
import LeftSide from "./LeftSide";
import RightSide from "./RightSide";

function Body() {
  const rowStyle = {
    border: "1px solid grey", // Border for Row component
    padding: "10px", // Padding for Row component
  };

  return (
    <div>
      {/* Dividing page in single row and further dividing into columns of 4 and 8 */}
      <Row style={rowStyle}>
        <Col md={4} ><LeftSide /></Col>
        <Col md={8} ><RightSide /></Col>
      </Row>
    </div>
  );
}

export default Body;
