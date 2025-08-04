const BlogDetails = ({ blogs }) => (
  <ul>
    {blogs.map((blog, index) => (
      <div key={index}>
        <h3>{blog.title}</h3>
        <strong>{blog.author}</strong>
        <p>{blog.desc}</p>
      </div>
    ))}
  </ul>
);
export default BlogDetails;
