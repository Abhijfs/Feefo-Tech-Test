import React from "react";
import Contact from "../contact/contact";

import "./header.css";

export const Header = ({ data }) => {

  return (
    <div className="header">
      <div className="overview">Account Overview</div>
      <div className="contact">
        <div className="title">Your Feefo Support Contact</div>
        <Contact data={data} />
      </div>
    </div>
  );
};

export default Header;
