import React from "react";

function TestBody({ title, name }) {
  // Accepting 'title' and 'name' Props from Body component in 'App.js'
  const bodyStyle = {
    background: "lightgreen",
    // position: "relative",
    left: 0,
    right: 0,
    padding: "10px",
    textAlign: "center",
    height: "500px",
  };

  return (
    <div style={bodyStyle}>
      <h1>Body</h1>
      <h2>{title}</h2>
      {/* Using 'title' Props earlier accepted in function as argument */}
      <h3>{name}</h3>
      {/* Using 'name' Props earlier accepted in function as argument */}
      <p>This is body component</p>
    </div>
  );
}

export default TestBody;
