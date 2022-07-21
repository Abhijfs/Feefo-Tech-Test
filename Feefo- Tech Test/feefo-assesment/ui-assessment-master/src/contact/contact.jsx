import React from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faEnvelope } from '@fortawesome/free-solid-svg-icons';

import './contact.css';

const Contact = (props) => {
	const { data } = props;

    return (
      <div className="contact-container">
        <div className="avator">{data.name[0]}</div>
        <div className="support">
          <div className="support-title">{data.name}</div>
          <div className="support-info">
            <div className="email">
              <FontAwesomeIcon icon={faEnvelope} />
              <div className="email-text">{data.email}</div>
            </div>
            <div className="email-text">{data.phone}</div>
          </div>
        </div>
      </div>
    );
}

export default Contact;