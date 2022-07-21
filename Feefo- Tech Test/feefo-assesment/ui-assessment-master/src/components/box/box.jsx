import React from "react";

import "./box.css";

const Box = (props) => {
  const { data } = props;

  return (
    <div className="box-container">
      <div className="box-content">
        <div className="numtxt">{data.num}%</div>
        <div className="label">{data.label}</div>
      </div>
    </div>
  );
};

export default Box;
