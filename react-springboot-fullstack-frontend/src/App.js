import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import './App.css';

function App() {
    return (
        <div>
            <Router>
                <HeaderComponent />
                <div className="container">
                    <Switch>
                        <Route exact path="/" component={ListEmployeeComponent}></Route>
                        <Route exact path="/employees" component={ListEmployeeComponent}></Route>                          
                        <Route path="*">
                            <h1>Error, no such page existing.</h1>
                            <a href="/">Back to homepage</a>
                        </Route>
                        </Switch>  
                </div>
                <FooterComponent />
            </Router>
        </div>
  );
}

export default App;
