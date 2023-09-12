import React from "react"; // 'React' component is coming from 'react'
import ReactDOM from "react-dom/client"; // 'ReactDOM' componenet is coming from 'react-dom/client'
import "./index.css";
import App from "./App"; // 'App' component is coming from './App'
import reportWebVitals from "./reportWebVitals";
import "bootstrap/dist/css/bootstrap.min.css";
import "react-toastify/dist/ReactToastify.css";

const root = ReactDOM.createRoot(document.getElementById("root"));
// document.getElementById("root") is simply javascript
// 'root' is the id of 'div'
// This 'root' is coming from 'index.html' from 'public'
root.render(
  // root.render is function which we called
  <React.StrictMode>
    <App />
    {/* // We gave 'App' component/function from 'App.js' to this function */}
    {/* // This 'App' component/function will render inside 'div' which has id 'root' */}
    {/* // All the HTML code inside 'App' component/function will go inside 'div' of id 'root' */}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
