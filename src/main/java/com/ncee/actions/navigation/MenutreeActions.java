package com.ncee.actions.navigation;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
@Namespace("/menutree")
@Results({
	@Result(name="questionlist",location="/WEB-INF/management/view/questionlist.jsp"),
	@Result(name="addquestion",location="/WEB-INF/management/publish/addquestion.jsp"),
	@Result(name="knowledgelist",location="/WEB-INF/management/view/knowledgelist.jsp"),
	@Result(name="addknowledge",location="/WEB-INF/management/publish/addknowledge.jsp"),
	@Result(name="paperlist",location="/WEB-INF/management/view/paperlist.jsp"),
	@Result(name="addpaper",location="/WEB-INF/management/publish/addpaper.jsp"),
	@Result(name="provincelist",location="/WEB-INF/management/view/provincelist.jsp"),
	@Result(name="addprovince",location="/WEB-INF/management/publish/addprovince.jsp")
})
public class MenutreeActions extends ActionSupport {
	private static final long serialVersionUID = -4529928123020487644L;
	@Action("questionlist")
	public String navigateToQuestionList(){
		return "questionlist";
	}
	@Action("addquestion")
	public String navigateToQuestionAdd(){
		return "addquestion";
	}
	@Action("knowledgelist")
	public String navigateToKnoledgeList(){
		return "knowledgelist";
	}
	@Action("addknowledge")
	public String navigateToKnowledgeAdd(){
		return "addknowledge";
	}
	@Action("paperlist")
	public String navigateToPaperList(){
		return "paperlist";
	}
	@Action("addpaper")
	public String navigateToPaperAdd(){
		return "addpaper";
	}
	@Action("provincelist")
	public String navigateToProvinceList(){
		return "provincelist";
	}
	@Action("addprovince")
	public String navigateToProvinceAdd(){
		return "addprovince";
	}
}
