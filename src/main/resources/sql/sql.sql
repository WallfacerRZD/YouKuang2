SELECT * FROM team_member

SELECT * FROM team_member WHERE studentID = #{studentID}

SELECT * FROM team_member WHERE name = #{name}

SELECT * FROM team_member WHERE hobby LIKE CONCAT('%', #{hobby}, '%')