package com.batuhan.icerikyonetimsistemi.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tblsoru")
public class Soru {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private KonuDetayı subjectDetail;
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	@Column(length = 64, unique = true)
	private String title;
	@Column(length = 255)
	private String soru;
        @Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	@Column(columnDefinition = "BOOLEAN default true")
	private boolean isEnabled;

	public Soru() {
		super();
		this.isEnabled = true;
	}

	public Soru(KonuDetayı subjectDetail, User user, String title, String soru, Date createAt,
			Date updatedAt) {
		super();
		this.subjectDetail = subjectDetail;
		this.user = user;
		this.title = title;
		this.soru = soru;
		this.createAt = createAt;
		this.updatedAt = updatedAt;
		this.isEnabled = true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public KonuDetayı getSubjectDetail() {
		return subjectDetail;
	}

	public void setSubjectDetail(KonuDetayı subjectDetail) {
		this.subjectDetail = subjectDetail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getsoru() {
		return soru;
	}

	public void setsoru(String soru) {
		this.soru = soru;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	@Override
	public String toString() {
		return "soru [id=" + id + ", subjectDetail=" + subjectDetail + ", user=" + user + ", title=" + title
				+ ", soru=" + soru + ", createAt=" + createAt + ", updatedAt=" + updatedAt + ", isEnabled="
				+ isEnabled + "]";
	}

}
