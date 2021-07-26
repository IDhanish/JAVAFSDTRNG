import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
var element = React.createElement('h1', { className: 'greeting' }, 'Hello, world!');
ReactDOM.render(element, document.getElementById('root'));
export default Example1;