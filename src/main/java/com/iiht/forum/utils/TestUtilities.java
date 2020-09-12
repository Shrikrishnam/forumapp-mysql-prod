package com.iiht.forum.utils;

import java.util.ArrayList;
import java.util.List;

import com.iiht.forum.dto.VisitorCommentsDto;
import com.iiht.forum.dto.VisitorPostsDto;
import com.iiht.forum.model.VisitorComments;
import com.iiht.forum.model.VisitorPosts;

public class TestUtilities {
	public VisitorPosts convertToVisitorPosts(VisitorPostsDto visitordto) {
		VisitorPosts visitorpost = new VisitorPosts();
		visitorpost.setPostId(visitordto.getPostId());
		visitorpost.setPostDescription(visitordto.getPostDescription());
		visitorpost.setTags(visitordto.getTags());
		visitorpost.setTitle(visitordto.getTitle());
		
		return visitorpost;
	}
	public VisitorComments convertToVisitorComments(VisitorCommentsDto commentdto) {
		VisitorComments visitorComment = new VisitorComments();
		visitorComment.setCommentId(commentdto.getCommentId());
		visitorComment.setPostId(commentdto.getCommentId());
		visitorComment.setTags(commentdto.getTags());
		visitorComment.setVisitorComment(commentdto.getVisitorComment());
		return visitorComment;
	}
	public VisitorCommentsDto convertToVisitorCommentsDto(VisitorComments visitorComments) {
		VisitorCommentsDto visitorCommentDto = new VisitorCommentsDto();
		visitorCommentDto.setCommentId(visitorComments.getCommentId());
		visitorCommentDto.setPostId(visitorComments.getPostId());
		visitorCommentDto.setTags(visitorComments.getTags());
		visitorCommentDto.setVisitorComment(visitorComments.getVisitorComment());
		return visitorCommentDto;
	}
	
	public VisitorPostsDto convertToVisitorPostsDto(VisitorPosts visitorPosts) {
		VisitorPostsDto visitorPostdto = new VisitorPostsDto();
		visitorPostdto.setPostDescription(visitorPosts.getPostDescription());
		visitorPostdto.setPostId(visitorPosts.getPostId());
		visitorPostdto.setTags(visitorPosts.getTags());
		visitorPostdto.setTitle(visitorPosts.getTitle());
		return visitorPostdto;
	}
	
	public List<VisitorPostsDto> convertToVisitorPostsDtoList(List<VisitorPosts> visitorPostList){
		List<VisitorPostsDto> list = new ArrayList<VisitorPostsDto>();
		for(VisitorPosts postdto: visitorPostList) {
			list.add(convertToVisitorPostsDto(postdto));
		}
		
		return list;
	}
	public List<VisitorCommentsDto> convertToVisitorCommentsDtoList(List<VisitorComments> visitorCommentsList){
	List<VisitorCommentsDto> list = new ArrayList<VisitorCommentsDto>();
	for(VisitorComments commentdto : visitorCommentsList)
	{
		list.add(convertToVisitorCommentsDto(commentdto));
	}
		return list;
	}
	
}
