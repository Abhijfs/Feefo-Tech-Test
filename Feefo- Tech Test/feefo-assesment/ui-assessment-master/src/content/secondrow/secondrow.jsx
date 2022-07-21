import React from "react";
import Box from "../../components/box/box";

import "./secondrow.css";

const SecondRow = (props) => {
  const { data } = props;

  const status = data.status || 0;
  const lines = data.lines || 0;

  const leftProps = {
    num: status,
    label: "Upload Success",
  };

  const rightProps = {
    num: lines,
    label: "Lines Saved",
  };

  return (
    <div className="second-row-container">
      <div className="left-box">
        <Box data={leftProps} />
      </div>
      <div className="right-box">
        <Box data={rightProps} />
      </div>
    </div>
  );
};

export default SecondRow;
