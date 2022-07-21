import React from "react";

import "./content.css";
import FirstRow from "./firstrow/firstrow";
import SecondRow from "./secondrow/secondrow";

const Content = (props) => {
  const { id, data } = props;

  function getPercent(applied, total) {
    return applied !== 0 && total !== 0 ? (applied / total) * 100 : 0;
  }

  const uploads = data.uploads || 0;
  const successfulUploads = data.successfulUploads || 0;
  const status = getPercent(successfulUploads, uploads);

  const linesAttempted = data.linesAttempted || 0;
  const linesSaved = data.linesSaved || 0;
  const lines = getPercent(linesSaved, linesAttempted);

  const topProps = {
    uploads,
    linesSaved,
  };

  const bottomProps = {
    status,
    lines,
  };

  return (
    <div className="content-container">
      <FirstRow data={topProps} />
      <SecondRow data={bottomProps} />
    </div>
  );
};

export default Content;
