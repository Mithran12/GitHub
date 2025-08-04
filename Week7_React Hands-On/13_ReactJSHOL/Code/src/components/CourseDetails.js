const CourseDetails = ({ courses }) => (
  <ul>
    {courses.map((course, index) => (
      <div key={index}>
        <h3>{course.cname}</h3>
        <p>{course.cdate}</p>
      </div>
    ))}
  </ul>
);
export default CourseDetails;
