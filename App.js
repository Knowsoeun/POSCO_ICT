import "./App.css"
import Hello from "./component/Hello";
import Hi from "./component/Hi";
import Title from "./component/Title";
import Count from "./component/Count";
import Clock from "./component/Clock";
import Form from "./component/Form";
import SignupForm from "./component/SignupForm";
import First from "./component/First";
import { useState } from "react";



function App(){
  /* const [time, setTime]=useState(new Date().toLocaleString());
  setInterval(() => {
    setTime(new Date().toLocaleString());
  }, 1000); */

  return (
    <div className="App">
      <header className="App-header">
        <First></First>
        <Vote></Vote>
        {/* <Form></Form>
        <SignupForm></SignupForm> */}
        {/* <Hi></Hi>
        <Hello></Hello>
        <Title title ="hello" name="react">
          <Title title="pppp" name="aaaa"></Title>
        </Title>
        <Title title = "hi" name="reactt1"></Title>
        <Count></Count>
        <Clock time={time}></Clock> */}
      </header>
    </div>
  );
}




export default App;
