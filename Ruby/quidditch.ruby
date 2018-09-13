

def quidditch_scoreboard(teams, actions)
    teams_arr = teams.split(" vs ")
    actions_arr = actions.split(",")
    team1_score = 0
    team2_score = 0

    actions_arr.each do |info|
        team , action = info.split(": ")
        if action == "Quaffle Goal"
            team == teams_arr[0] ? team1_score += 10 : team2_score += 10
        else
            team ==teams_arr[0] ? team1_score -= 30 : team2_score -= 30
        end
    end

    return "#{teams_arr[0]}: #{team1_score}, #{teams_arr[1]"
end

