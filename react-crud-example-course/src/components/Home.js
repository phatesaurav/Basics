import React, { useEffect } from "react";
import { Container, Button } from "reactstrap";
import { Link } from "react-router-dom"; // Import Link from react-router-dom

function Home() {
  const jumbotronStyle = {
    borderRadius: "6px",
    paddingLeft: "15px",
    paddingRight: "15px",
    backgroundColor: "#eee",
    marginBottom: "30px",
    paddingBottom: "30px",
    paddingTop: "30px",
  };

  const jumbotronStyle768 = {
    paddingLeft: "60px",
    paddingRight: "60px",
  };

  const jumbotronStyle768pt = {
    paddingBottom: "48px",
    paddingTop: "48px",
  };

  /* This will change the title of page in browser windows */
  useEffect(function () {
    document.title = "Home";
  }, []);

  return (
    <div style={jumbotronStyle} className="text-center">
      <h1 className="display-4">Learn Code With Durgesh</h1>
      <p>
        This is a Course Application developed using Spring Boot and React.js
      </p>
      <Container>
        {/* Use Link to create a link to the root path */}
        <Link to="/add-courses">
          <Button color="primary" outline>
            Start Using
          </Button>
        </Link>
      </Container>

      <style>
        {`
          @media screen and (min-width: 768px) {
            .container-fluid .jumbotron, .container .jumbotron {
              ${Object.keys(jumbotronStyle768)
                .map((prop) => `${prop}: ${jumbotronStyle768[prop]};`)
                .join("\n")}
            }

            .jumbotron {
              ${Object.keys(jumbotronStyle768pt)
                .map((prop) => `${prop}: ${jumbotronStyle768pt[prop]};`)
                .join("\n")}
            }
          }
        `}
      </style>
    </div>
  );
}

export default Home;
