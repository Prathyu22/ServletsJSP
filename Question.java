import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	public Set<String> getAnswers1() {
		return answers1;
	}

	public void setAnswers1(Set<String> answers1) {
		this.answers1 = answers1;
	}

	private List<String> answers;
	private Set<String> answers1;
	
	/*public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(answers, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		return Objects.equals(answers, other.answers) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
