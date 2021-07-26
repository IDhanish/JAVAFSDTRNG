import React from 'react';
import ReactDOM from 'react-dom';
import Example3 from './Example3';
class Student extends React.Component{
    render(){
        return <p>This is training</p>
    }
}
ReactDOM.render(<Student />,document.getElementById('root'));
export default Example3;
