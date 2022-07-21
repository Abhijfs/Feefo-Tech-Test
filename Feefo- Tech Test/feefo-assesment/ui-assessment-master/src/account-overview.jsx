import React from "react";

import "./account-overview.css";
import Header from "./header/header";
import Content from "./content/content";

export const AccountOverview = ({ data }) => {
  const support = data ? { ...data.supportContact } : {};
  const sales = data ? { ...data.salesOverview } : {};

  return (
    <div className="AccountOverview">
      <Header data={support} />
      <Content data={sales}/>
    </div>
  );
};

export default AccountOverview;