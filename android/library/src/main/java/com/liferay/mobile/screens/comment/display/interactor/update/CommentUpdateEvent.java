package com.liferay.mobile.screens.comment.display.interactor.update;

import com.liferay.mobile.screens.base.interactor.BasicEvent;
import com.liferay.mobile.screens.models.CommentEntry;
import org.json.JSONObject;

/**
 * @author Alejandro Hernández
 */
public class CommentUpdateEvent extends BasicEvent {

	public CommentUpdateEvent(int targetScreenletId, Exception e) {
		super(targetScreenletId, e);
	}

	public CommentUpdateEvent(int targetScreenletId, CommentEntry commentEntry) {
		super(targetScreenletId);

		_commentEntry = commentEntry;
	}

	public CommentEntry getCommentEntry() {
		return _commentEntry;
	}

	private CommentEntry _commentEntry;

}
