import React from "react";

function Footer() {
  const footerStyle = {
    background: "lightblue",
    /* position: "fixed", */
    padding: "5px",
    textAlign: "center",
    border: "1px solid grey", // Add the border style and color here
    marginTop:"5px",
    marginBottom:"5px",
  };

  return (
    <div style={footerStyle}>
      <h1>Footer</h1>
      <p>This is footer component for learning purpose</p>
    </div>
  );
}

export default Footer;
