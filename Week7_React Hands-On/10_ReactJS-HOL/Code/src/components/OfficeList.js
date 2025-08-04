import React from 'react';
import '../App.css'; 

function OfficeList() {
  const officeList = [
    {
      name: 'DBS',
      rent: 50000,
      address: 'Chennai',
      image: 'https://img.freepik.com/free-photo/modern-office-space-interior_158595-5206.jpg'
    },
    {
      name: 'Regus',
      rent: 70000,
      address: 'Bangalore',
      image: 'https://img.freepik.com/free-photo/modern-office-space-interior_158595-5206.jpg'
    }
  ];

  return (
    <div>
      <h1>Office Space , at Affordable Range</h1>
      {officeList.map((item, index) => {
        const rentClass = item.rent <= 60000 ? 'textRed' : 'textGreen';
        return (
          <div key={index}>
            <img src={item.image} alt={item.name} width="300" height="200" />
            <h2>Name: {item.name}</h2>
            <p className={rentClass}>Rent: Rs. {item.rent}</p>
            <p><b>Address:</b> {item.address}</p>
            <hr />
          </div>
        );
      })}
    </div>
  );
}

export default OfficeList;