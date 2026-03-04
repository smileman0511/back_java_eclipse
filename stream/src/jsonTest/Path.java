package jsonTest;

import java.util.Objects;

public class Path {
	private String path;
	
	public Path() {;}

	public Path(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public int hashCode() {
		return Objects.hash(path);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Path other = (Path) obj;
		return Objects.equals(path, other.path);
	}

	@Override
	public String toString() {
		return "Path [path=" + path + "]";
	}
	
	
}
