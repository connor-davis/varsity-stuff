function Trinity() {}

Trinity("MATCH (n:User) RETURN n.id, n.email, n.lastLogin");