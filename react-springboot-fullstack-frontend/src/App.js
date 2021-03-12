import React from 'react';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';

function App() {
  return (
      <div className="container">
          <HeaderComponent />
          <ListEmployeeComponent />
          <FooterComponent />
    </div>
  );
}

export default App;
