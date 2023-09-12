import React, { useEffect } from "react";

function AboutUs() {
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
    document.title = "About Us";
  }, []);

  return (
    <div style={jumbotronStyle} className="text-center">
      <h1 className="display-4">About Us</h1>
      <p>
        Welcome to [Your Company Name]! We are a dedicated team of professionals
        working together to provide exceptional products and services to our
        customers.
      </p>
      <p>
        Our mission is to deliver high-quality [products/services] that enhance
        the lives of our customers. With over [number of] years of experience in
        the industry, we have successfully [mention significant achievements or
        milestones].
      </p>
      <p>
        At [Your Company Name], we take pride in our commitment to quality,
        innovation, and customer satisfaction. Our team is passionate about
        [mention what your team is passionate about], and we are continuously
        striving to [describe your future goals and plans].
      </p>
      <p>
        We look forward to serving you and meeting your [product/service] needs.
        If you have any questions or would like to get in touch, please don't
        hesitate to <a href="/contact-us">contact us</a>.
      </p>

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

export default AboutUs;
