import React from "react";

function Header() {
  const headerStyle = {
    background: "lightyellow",
    // There are five different position values: static, relative, fixed, absolute, sticky.
    // Static positioned div are not affected by the top, bottom, left, and right properties.
    // Relative positioned div can be adjusted from its normal position setting the top, right, bottom, and left properties.
    // Fixed positioned div always stays in the same place even if the page is scrolled, can use top, right, bottom, and left.
    // Absolute positioned div is positioned inside parent div with top, right, bottom, and left properties.
    // Sticky is positioned based on the user's scroll position.
    position: "sticky",
    padding: "5px",
    // The padding property in CSS is used to create space between the content of an element and its border.
    // padding: "10px" is adding 10 pixels of space between content (<h1> and <p> elements) and <div> that contains them.
    textAlign: "center",
    border: "1px solid grey", // Add the border style and color here
    marginTop:"5px",
    marginBottom:"5px",
  };

  return (
    <div style={headerStyle}>
      <h1>Welcome to Course Application</h1>
      <p>This is header component for learning purpose</p>
    </div>
  );
}

export default Header;
