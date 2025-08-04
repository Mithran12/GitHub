import React from 'react';

export default function OddPlayers({ players }) {
  const [first, , third, , fifth] = players;

  return (
    <div>
      <li>First : {first}</li>
      <li>Third : {third}</li>
      <li>Fifth : {fifth}</li>
    </div>
  );
}
