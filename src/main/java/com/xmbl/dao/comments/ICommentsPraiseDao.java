package com.xmbl.dao.comments;

import com.xmbl.model.comments.CommentsPraise;
import com.xmbl.mongo.dao.GeneralDao;

/**
 * @author: sunbenbao
 * @Email: 1402614629@qq.com
 * @类名:  IStoryCommentsPraiseDao 
 * @创建时间:  2017年12月22日 下午1:59:58
 * @修改时间:  2017年12月22日 下午1:59:58
 * @类说明:
 */
public interface ICommentsPraiseDao extends GeneralDao<CommentsPraise>{

	CommentsPraise findByConditions(String get_id, String player_id);

	CommentsPraise insertOrUpdateCommentsPraise(CommentsPraise commentsPraise);

}
