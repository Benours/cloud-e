package dev.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String title;
	private String content;
	private String image;
	private LocalDate date;
	private int likes;
	private boolean isliked;

	@OneToMany(mappedBy = "topic")
	private List<Tag> tag;

	@OneToMany(mappedBy = "topic")
	private List<Message> messages;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Tag> getTag() {
		return tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public boolean isIsliked() {
		return isliked;
	}

	public void setIsliked(boolean isliked) {
		this.isliked = isliked;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
}
