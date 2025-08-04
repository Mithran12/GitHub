import React, { useState } from "react";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  // 1. Increment button: Calls multiple methods
  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const sayHello = () => {
    alert("localhost:3000 says\nHello Member1");
  };

  const decrement = () => {
    setCount(count - 1);
  };

  // 2. Say Welcome button with argument
  const saySomething = (message) => {
    alert(`localhost:3000 says\n${message}`);
  };

  // 3. Synthetic Event
  const handleClick = () => {
    alert("localhost:3000 says\nI was clicked");
  };

  // 4. Currency Converter
  const handleSubmit = (e) => {
    e.preventDefault();
    let convertedAmount = 0;

    if (currency.toLowerCase() === "euro") {
      // Assume 1 Euro = 80 Rupees
      convertedAmount = parseFloat(amount) * 80;
      alert(`localhost:3000 says\nConverting to Euro Amount is ${convertedAmount}`);
    } else {
      alert("localhost:3000 says\nPlease enter a valid currency (e.g., Euro)");
    }
  };

  return (
    <div className="App">
      <h1>{count}</h1>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <br /><br />
      <button onClick={() => saySomething("welcome")}>Say welcome</button>
      <br /><br />
      <button onClick={handleClick}>Click on me</button>

      <br /><br />
      <CurrencyConverter
        amount={amount}
        currency={currency}
        setAmount={setAmount}
        setCurrency={setCurrency}
        handleSubmit={handleSubmit}
      />
    </div>
  );
}

// CurrencyConverter Component
const CurrencyConverter = ({ amount, currency, setAmount, setCurrency, handleSubmit }) => {
  return (
    <div>
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>Amount:</label>
        <input
          type="text"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        /><br />
        <label>Currency:</label>
        <input
          type="text"
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default App;
