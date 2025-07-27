import React from 'react';
import './App.css';
import Home from './Component/Home';
import About from './Component/About';
import Contact from './Component/Contact';

function App() {
  return (
    <div className="Container">
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default App;
