import './App.css';
import React, {useState} from "react";

function App() {

  // Definir el estado para almacenar el resultado de la suma
  const [result, setResult] = useState(null);

  const element = <h1 className='center-title'>Hi Aned</h1>
  //const element2 = <h2>{add(10,7)}{/* El código JS debe ir entre llaves*/}</h2>

  const pressButton=()=>{
    const result=add(10,7);
    setResult(result);
  }

  return <div>
      <button onClick={pressButton} style={{marginTop: "10px", marginLeft:"10px"}}>Press Me</button>
      <div>{element}</div>
      <div>{result!=null && <h2>Result: {result}</h2>}</div>
    </div>
}


function add(a,b){
  return a + b;
}

export default App;
