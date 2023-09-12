import { Button } from "reactstrap";
import { ToastContainer, toast } from "react-toastify";

function MyButton() {
  const buttonStyle = {
    background: "papayawhip",
    padding: "55px",
    textAlign: "center",
  };
  /* const notify = () => toast("Wow so easy!"); */
  /* const notify = () => toast.success("Done!"); */
  function notify() {
    toast.success("Done!");
  }

  return (
    <div style={buttonStyle}>
      <h1>This is MyButton component</h1>
      <Button color="warning" outline onClick={notify}>
        First React Button
      </Button>
      <ToastContainer />
    </div>
  );
}

export default MyButton;
