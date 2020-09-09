package com.example.bookretrofitapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import androidx.lifecycle.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.invoke
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by inject()
    @ExperimentalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonView.setOnClickListener {
            buttonView.visibility = GONE
            setText(getResponse())
        }
    }
    private fun getViewModel(): MainViewModel {
        return mainViewModel
//        return ViewModelProvider(this, getViewModelFactory()).get(MainViewModel::class.java)
    }

    /*private fun getViewModelFactory(): ViewModelProvider.Factory {
        return MainViewModelFactory("ryOX7WaLMNT9uclXL53TkYHMcYkQTYFa")
    }*/

    @ExperimentalCoroutinesApi
    private fun getResponse() : LiveData<Books>{
        return liveData {
            val response = getViewModel().getBooksFromRepo()//getBooks()
            Dispatchers.Main {
                emit(response)
            }
        }
    }

    private fun setText(responseLiveData: LiveData<Books>) {
        responseLiveData.observe(this, Observer {
            val bookList = it.results.listIterator()
            while (bookList.hasNext()){
                val book = bookList.next()

                textView.append("Copyright is ${it.copyright}\n" +
                        "    Book name is ${book.displayName}\n" +
                        "    List name is ${book.listName}\n" +
                        "    Newest published date is ${book.newestPublishedDate}\n" +
                        "    Updated is ${book.updated}\n\n\n")
            }
        })
    }
}