import React, { useEffect } from "react";

function ContactUs() {
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

  useEffect(function () {
    document.title = "Contact Us";
  }, []);

  return (
    <div style={jumbotronStyle} className="text-center">
      <h1 className="display-4">Contact Us</h1>
      <p>
        We'd love to hear from you! If you have any questions, comments, or
        inquiries, please feel free to get in touch with us using the contact
        information below:
      </p>
      <h2>Contact Information</h2>
      <ul style={{ listStyleType: "none", padding: 0 }}>
        <li>
          <strong>Email:</strong> contact@example.com
        </li>
        <li>
          <strong>Phone:</strong> +1 (123) 456-7890
        </li>
        <li>
          <strong>Address:</strong> 123 Main Street, Cityville, Country
        </li>
      </ul>

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

export default ContactUs;
