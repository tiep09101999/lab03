package com.oms.components.media.book.controller;

import java.util.List;
import java.util.Map;

import com.oms.app.factory.AdminPageFactory;
import com.oms.bean.Book;
import com.oms.bean.Media;
import com.oms.components.media.book.gui.BookSearchPane;
import com.oms.components.media.book.gui.BookSinglePane;
import com.oms.components.media.controller.AdminMediaPageController;
import com.oms.components.media.gui.MediaSearchPane;
import com.oms.components.media.gui.MediaSinglePane;
import com.oms.serverapi.BookApi;
import com.oms.serverapi.IMediaApi;
import com.oms.serverapi.MediaApi;

public class AdminBookPageController extends AdminMediaPageController{

	static {
		AdminPageFactory.getInstance().registerPage(
				"book",new AdminBookPageController());
	}

	private IMediaApi iMediaApi;

	public AdminBookPageController() {
		this.iMediaApi=new BookApi();
	}

	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		MediaApi mediaApi=MediaApi.getInstance();
		return mediaApi.getBooks(searchParams);
	}
	
	@Override
	public MediaSinglePane createSinglePane() {
		return new BookSinglePane();
	}
	
	@Override
	public MediaSearchPane createSearchPane() {
		return new BookSearchPane();
	}
	
	@Override
	public Media updateMedia(Media media) {
		return  iMediaApi.updateMedia((Book)media);
	}
}
