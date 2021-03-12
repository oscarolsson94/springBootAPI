import React from 'react';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import './App.css';

function App() {
    return (
        <div>
            <HeaderComponent />
                 <div className="container">        
                    <ListEmployeeComponent />
                 </div>
            <FooterComponent />
        </div>
  );
}

export default App;
