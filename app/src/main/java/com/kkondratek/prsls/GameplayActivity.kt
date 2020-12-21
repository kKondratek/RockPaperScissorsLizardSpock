package com.kkondratek.prsls

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import java.util.*

class GameplayActivity : AppCompatActivity() {
    private var botChoiceView: ImageView? = null
    private var resultText: TextView? = null
    private var playerScoreText: TextView? = null
    private var botScoreText: TextView? = null
    private var playerScore = 0
    private var botScore = 0
    private var botScoreStr: String? = null
    private var playerScoreStr: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gameplay)
        botChoiceView = findViewById(R.id.botChoiceView)
        resultText = findViewById(R.id.gameResultsText)
        playerScoreText = findViewById(R.id.playerScoreText)
        playerScoreStr = resources.getString(R.string.player_score)
        botScoreText = findViewById(R.id.botScoreText)
        botScoreStr = resources.getString(R.string.bot_score)
        playerScore = 0
        playerScoreText!!.text = playerScoreStr + playerScore
        botScore = 0
        botScoreText!!.text = botScoreStr + botScore
    }

    fun playerChoice(view: View) {
        val playerChoice = view.id
        val score = getGameScore(playerChoice)
        if (score > 0) {
            playerScore++
            playerScoreText!!.text = playerScoreStr + playerScore
        } else if (score < 0) {
            botScore++
            botScoreText!!.text = botScoreStr + botScore
        }
    }

    fun resetScore(view: View) {
        playerScore = 0
        playerScoreText!!.text = playerScoreStr + playerScore
        botScore = 0
        botScoreText!!.text = botScoreStr + botScore
        botChoiceView!!.setImageResource(R.drawable.bot_choice_img)
    }

    private fun getGameScore(playerChoice: Int): Int {
        var score = 0
        val random = Random()
        val botChoice = random.nextInt(5)
        val gameResultText: String
        when (botChoice) {
            0 -> {
                botChoiceView!!.setImageResource(R.drawable.rock_button)
                when (playerChoice) {
                    R.id.paperButton -> {
                        gameResultText = resources.getString(R.string.paper_rock) + resources.getString(R.string.player_won)
                        resultText!!.text = gameResultText
                        score = 1
                    }
                    R.id.scissorsButton -> {
                        gameResultText = resources.getString(R.string.rock_scissors) + resources.getString(R.string.bot_won)
                        resultText!!.text = gameResultText
                        score = -1
                    }
                    R.id.lizardButton -> {
                        gameResultText = resources.getString(R.string.rock_lizard) + resources.getString(R.string.bot_won)
                        resultText!!.text = gameResultText
                        score = -1
                    }
                    R.id.spockButton -> {
                        gameResultText = resources.getString(R.string.spock_rock) + resources.getString(R.string.player_won)
                        resultText!!.text = gameResultText
                        score = 1
                    }
                    else -> {
                        resultText!!.text = resources.getString(R.string.draw)
                        score = 0
                    }
                }
            }
            1 -> {
                botChoiceView!!.setImageResource(R.drawable.paper_button)
                when (playerChoice) {
                    R.id.rockButton -> {
                        gameResultText = resources.getString(R.string.paper_rock) + resources.getString(R.string.bot_won)
                        resultText!!.text = gameResultText
                        score = -1
                    }
                    R.id.scissorsButton -> {
                        gameResultText = resources.getString(R.string.scissors_paper) + resources.getString(R.string.player_won)
                        resultText!!.text = gameResultText
                        score = 1
                    }
                    R.id.lizardButton -> {
                        gameResultText = resources.getString(R.string.lizard_paper) + resources.getString(R.string.player_won)
                        resultText!!.text = gameResultText
                        score = 1
                    }
                    R.id.spockButton -> {
                        gameResultText = resources.getString(R.string.paper_spock) + resources.getString(R.string.bot_won)
                        resultText!!.text = gameResultText
                        score = -1
                    }
                    else -> {
                        resultText!!.text = resources.getString(R.string.draw)
                        score = 0
                    }
                }
            }
            2 -> {
                botChoiceView!!.setImageResource(R.drawable.scissors_button)
                when (playerChoice) {
                    R.id.paperButton -> {
                        gameResultText = resources.getString(R.string.scissors_paper) + resources.getString(R.string.bot_won)
                        resultText!!.text = gameResultText
                        score = -1
                    }
                    R.id.rockButton -> {
                        gameResultText = resources.getString(R.string.rock_scissors) + resources.getString(R.string.player_won)
                        resultText!!.text = gameResultText
                        score = 1
                    }
                    R.id.lizardButton -> {
                        gameResultText = resources.getString(R.string.scissors_lizard) + resources.getString(R.string.bot_won)
                        resultText!!.text = gameResultText
                        score = -1
                    }
                    R.id.spockButton -> {
                        gameResultText = resources.getString(R.string.spock_scissors) + resources.getString(R.string.player_won)
                        resultText!!.text = gameResultText
                        score = 1
                    }
                    else -> {
                        resultText!!.text = resources.getString(R.string.draw)
                        score = 0
                    }
                }
            }
            3 -> {
                botChoiceView!!.setImageResource(R.drawable.lizard_button)
                when (playerChoice) {
                    R.id.paperButton -> {
                        gameResultText = resources.getString(R.string.lizard_paper) + resources.getString(R.string.bot_won)
                        resultText!!.text = gameResultText
                        score = -1
                    }
                    R.id.scissorsButton -> {
                        gameResultText = resources.getString(R.string.scissors_lizard) + resources.getString(R.string.player_won)
                        resultText!!.text = gameResultText
                        score = 1
                    }
                    R.id.rockButton -> {
                        gameResultText = resources.getString(R.string.rock_lizard) + resources.getString(R.string.player_won)
                        resultText!!.text = gameResultText
                        score = 1
                    }
                    R.id.spockButton -> {
                        gameResultText = resources.getString(R.string.lizard_spock) + resources.getString(R.string.bot_won)
                        resultText!!.text = gameResultText
                        score = -1
                    }
                    else -> {
                        resultText!!.text = resources.getString(R.string.draw)
                        score = 0
                    }
                }
            }
            4 -> {
                botChoiceView!!.setImageResource(R.drawable.spock_button)
                when (playerChoice) {
                    R.id.paperButton -> {
                        gameResultText = resources.getString(R.string.paper_spock) + resources.getString(R.string.player_won)
                        resultText!!.text = gameResultText
                        score = 1
                    }
                    R.id.scissorsButton -> {
                        gameResultText = resources.getString(R.string.spock_scissors) + resources.getString(R.string.bot_won)
                        resultText!!.text = gameResultText
                        score = -1
                    }
                    R.id.lizardButton -> {
                        gameResultText = resources.getString(R.string.lizard_spock) + resources.getString(R.string.player_won)
                        resultText!!.text = gameResultText
                        score = 1
                    }
                    R.id.rockButton -> {
                        gameResultText = resources.getString(R.string.spock_rock) + resources.getString(R.string.bot_won)
                        resultText!!.text = gameResultText
                        score = -1
                    }
                    else -> {
                        resultText!!.text = resources.getString(R.string.draw)
                        score = 0
                    }
                }
            }
        }
        return score
    }
}
