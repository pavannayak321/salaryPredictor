from flask import Flask , render_template , flash ,request ,url_for ,redirect

import numpy as np
import pandas as pd
import matplotlib.pyplot  as plt


'''
'''
dataset = pd.read_csv('data/Salary_Data.csv')

#classifying the data into dependent And independent variables
X = dataset.iloc[:,0].values
y = dataset.iloc[:,1].values

#checking for null values 
dataset.isnull().sum()

#splitiing up the dataset into training and testing 
from sklearn.model_selection import train_test_split
X_train,X_test,y_train,y_test = train_test_split(X,y,test_size=0.33,random_state=1)
#we usually set random set to see the performance of model in prtoduction split the training datset randomly  

#As we can see the salary is in the raw form we are not required too apply Feature Scaling
from sklearn.linear_model import LinearRegression
regressor = LinearRegression()
#reshape(-1,1) indicates that row is unknown and column is exactly 1
regressor.fit(X_train.reshape(-1,1),y_train.reshape(-1,1))


#predict the salary on expierience 
y_pred = regressor.predict([[2.5]])



app = Flask(__name__)


@app.route('/' , methods = ['POST','GET'])
def index():
    return render_template('index.html')






@app.route('/m' ,methods = ['POST','GET'])
def flas():

	if request.method == 'POST':
		result = float(request.form['nm'])
        
		result  = regressor.predict([[result]])
		result = str(result)
		s = result.replace('[','',2)
		s = s.replace(']','',2)

		result = s
		return render_template('predicted.html',result=result)








@app.route('/pg')
def matplot():
	import matplotlib.pyplot as plt
	import pandas as pd
	import numpy as np


	plt.plot([1,2,3,4,5],[6,5,4,3,2])
	plt.show()


	return 'None'

@app.route('/salary')
def salary_pred():
	pass





if  __name__ =='__main__':

    app.run(debug = True)
    
