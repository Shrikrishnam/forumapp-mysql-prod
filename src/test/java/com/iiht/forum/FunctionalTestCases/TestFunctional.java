package com.iiht.forum.FunctionalTestCases;

import static com.iiht.forum.UtilTestClass.TestUtils.businessTestFile;
import static com.iiht.forum.UtilTestClass.TestUtils.currentTest;
import static com.iiht.forum.UtilTestClass.TestUtils.yakshaAssert;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.iiht.forum.UtilTestClass.MasterData;
import com.iiht.forum.dto.VisitorCommentsDto;
import com.iiht.forum.dto.VisitorPostsDto;
import com.iiht.forum.service.CommentService;
import com.iiht.forum.service.PostService;


@RunWith(SpringRunner.class)
public class TestFunctional 
{	
	@MockBean
	private PostService postService;
	
	@MockBean
	private CommentService commentService;
	
	//--------------------------------------------------------------------------------------------------------------------------------
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	@Test
	public void testSavePosts() throws Exception 
	{
		VisitorPostsDto value = postService.saveUpdate(MasterData.getPostDtoDetails());
	    yakshaAssert(currentTest(), value != null ? true : false, businessTestFile);
	}

	//--------------------------------------------------------------------------------------------------------------------------------
	@Test
	public void testSaveComments() throws Exception 
	{
		VisitorCommentsDto value = commentService.saveUpdate(MasterData.getCommentDtoDetails());
	    yakshaAssert(currentTest(), value != null ? true : false, businessTestFile);
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	@Test
	public void testViewAllPosts() throws Exception 
	{
		List<VisitorPostsDto> list = new ArrayList<VisitorPostsDto>();
		list.add(new VisitorPostsDto());
		list.add(new VisitorPostsDto());
	    Mockito.when(postService.getAllPosts()).thenReturn((List<VisitorPostsDto>) list);
	    List<VisitorPostsDto> postFromdb = postService.getAllPosts();
	    yakshaAssert(currentTest(), postFromdb == list ? true : false, businessTestFile);
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	@Test
	public void testViewAllComments() throws Exception
	{
		VisitorCommentsDto vComment = new VisitorCommentsDto();
	    Mockito.when(commentService.getCommentById((long)1)).thenReturn(vComment);
	    VisitorCommentsDto commentFromdb = commentService.getById((long)10);
	    yakshaAssert(currentTest(), commentFromdb != null ? true : false, businessTestFile);
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	@Test
	public void testViewAllDiscussions() throws Exception 
	{
		List<VisitorPostsDto> list = new ArrayList<VisitorPostsDto>();
		list.add(new VisitorPostsDto());
		list.add(new VisitorPostsDto());
	    Mockito.when(postService.getAllPosts()).thenReturn((List<VisitorPostsDto>) list);
		List<VisitorPostsDto> discussionFromdb = postService.getAllPosts();
	    yakshaAssert(currentTest(), discussionFromdb == list ? true : false, businessTestFile);
	}	
}