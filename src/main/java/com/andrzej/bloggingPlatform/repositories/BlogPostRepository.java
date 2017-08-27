package com.andrzej.bloggingPlatform.repositories;

import com.andrzej.bloggingPlatform.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.PostRemove;

/**
 * Created by andrzej on 27.08.17.
 */

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {


}
