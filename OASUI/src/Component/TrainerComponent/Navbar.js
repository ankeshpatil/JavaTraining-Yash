import { Link } from "react-router-dom";
const Navbar = () => {
  <nav className="navbar navbar-expand-lg bg-light">
    <div className="container-fluid">
      <Link className="navbar-brand" to="#">
        Navbar
      </Link>
      <button
        className="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span className="navbar-toggler-icon"></span>
      </button>
    </div>
  </nav>;
};
export default Navbar;
