import React, { useState } from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import { books, blogs, courses } from './data';

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  return (
    <div style={{ display: 'flex', justifyContent: 'space-around', textAlign: 'left' }}>
      {/* Course */}
      <div className="mystyle1">
        <h1>Course Details</h1>
        {showCourses && <CourseDetails courses={courses} />}
      </div>

      {/* Books */}
      <div className="st2">
        <h1>Book Details</h1>
        {showBooks ? <BookDetails books={books} /> : <p>No books to display</p>}
      </div>

      {/* Blogs */}
      <div className="v1">
        <h1>Blog Details</h1>
        {showBlogs && blogs.length > 0 && <BlogDetails blogs={blogs} />}
      </div>
    </div>
  );
}

export default App;
