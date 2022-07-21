import React from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faUpload, faInfoCircle } from "@fortawesome/free-solid-svg-icons";

import "./firstrow.css";

const FirstRow = (props) => {
  const { data } = props;

  const uploads = data.uploads || 0;
  const lines = data.linesSaved || 0;

  return (
    <div className="first-row-container">
      <div className="first-row-top">
        <div className="top-title">
          <div className="upload">
            <FontAwesomeIcon icon={faUpload} />
          </div>
          <div className="top-text">Sales</div>
        </div>
        <div className="info-icon">
          <FontAwesomeIcon icon={faInfoCircle} />
        </div>
      </div>
      <div className="first-row-bottom">
        <div className="bottom-text">
          You had {uploads} uploads and {lines} lines added.
        </div>
      </div>
    </div>
  );
};

export default FirstRow;
